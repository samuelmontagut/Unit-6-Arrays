
public class MusicLibrary {
	
	Album[] tracks = new Album[10];
	double playTime;
	
	public MusicLibrary() {
		
	}
	
	public void add(Album n) {
		for (int i = 0; i < 10; i++){
			if (tracks[i] == null) {
				tracks[i] = n;
				i = 10;
			}
		}
	}
	
	public void remove(int m) {
		tracks[m] = null;
	}
	
	public void doubleSize() {
		Album[] tracks2 = new Album[20];
		for (int i = 0; i < tracks.length; i ++) {
			tracks2[i] = tracks[i];
		}
		tracks = tracks2;
	}
	public String toString() {
		String albums = "";
		for (int i = 0; i < tracks.length; i++) {
			if(tracks[i] != null) {
				albums = albums + tracks[i].getName() + " by " + tracks[i].getArtist() + ", ";
			}
			else if (tracks[i] == null) {
				albums = albums + " ___,";
			}
		}
		return albums;
	}
	
	public Album getAlbum(int index) {
		if(index >= 0 && index < tracks.length) {
			return tracks[index];
		}
		else {
			return null;
		}
	}
	
	public void sortByTitle() {
		for(int i = 1; i < tracks.length; i++) {
			Album key = tracks[i];
			int position = i;
			if(tracks[position - 1] != null && tracks[i] != null) {
				while (position > 0 && tracks[position - 1].getName().compareTo(key.getName()) > 0){
		           tracks[position] = tracks[position - 1];
		           position--;
		       }
		       tracks[position] = key;
			}
		}
	}
	
	public void sortByArtist() {
		int min;
		Album temp;
		
		   for( int i = 0; i < tracks.length - 1; i++){
		       min = i;
		       for(int scan = i + 1; scan < tracks.length; scan++){
		    	   if(tracks[scan] != null && tracks[min] != null) {
		    		   if(tracks[scan].getArtist().compareTo(tracks[min].getArtist()) < 0)
		    			   min = scan;
		      	}
		       }

		       temp = tracks[min];
		       tracks[min] = tracks[i];
		       tracks[i] = temp;
		   }
		
	}
	
	public int binaryFindArtist(String artist) {
        sortByArtist();
        int low = 0;
        int high = tracks.length - 1;
        int middle = (low + high) / 2;

            while (tracks[middle] != null && tracks[middle].getArtist().compareTo(artist) < 0 && low <= high) {
                if (artist.compareTo(tracks[middle].getArtist()) < 0)
                    high = middle - 1;
                else
                    low = middle + 1;
                middle = (low + high) / 2;
            }

            if (tracks[middle] != null && tracks[middle].getArtist().equals(artist))
                return middle;
            else
                return -1;
        }
	
	public int binaryFindTitle(String title) {
        sortByTitle();
        int low = 0;
        int high = tracks.length - 1;
        int middle = (low + high) / 2;

        while (tracks[middle] != null && tracks[middle].getName().compareTo(title) < 0 && low <= high) {
            if (title.compareTo(tracks[middle].getName()) < 0)
                high = middle - 1;
            else
                low = middle + 1;
            middle = (low + high) / 2;
        }

        if (tracks[middle] != null && tracks[middle].getName().equals(title))
            return middle;
        else
            return -1;
    }
	
	public String findAlbum(String a) {
		for (int i = 0; i < tracks.length; i++) {
			if (tracks[i] != null && tracks[i].getName().contentEquals(a)){
				return tracks[i].getName() + " by " + tracks[i].getArtist() + "\nIt's the " + (i+1) + " album in the playlist";
			}
		}
		return "not here";
	}
	
	public String findArtist(String a) {
		for (int i = 0; i < tracks.length; i++) {
			if (tracks[i] != null && tracks[i].getArtist().contentEquals(a)){
				return tracks[i].getName() + " by " + tracks[i].getArtist() + "\nIt's the " + (i+1) + " album in the playlist";
			}
		}
		return "not here";
	}

}
