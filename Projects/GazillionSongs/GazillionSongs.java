package GazillionSongs;

import java.io.*;
import java.util.*;

public class GazillionSongs {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Song> tempList = new ArrayList<Song>();
		SongCollection songs = new SongCollection(tempList);
		
		Scanner ipt = new Scanner(System.in);
		System.out.println("Which file would you like to input?"); //C:\Users\s-tsengl\Downloads\APCS_Java-master\Projects\GazillionSongs\agazillionsongs.txt
		File iptFile = new File(ipt.nextLine());
		Scanner f = new Scanner(iptFile);
		/*System.out.println("Which file would you like to output to?");
		File optFile = new File(ipt.nextLine());*/
		while(f.hasNextLine()) {
			tempList.add(Song.parse(f.nextLine()));
		}
		for(int i = 0; i<tempList.size();i++) {
			songs.filterYear();
		}
		
	}
}
