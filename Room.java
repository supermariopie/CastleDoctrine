import java.io.*;
import java.util.*;
public class Room
{
  static ClassLoader cl;
  static BufferedReader br;
  static StringTokenizer st;
  static PrintWriter pw;
  //contains a dict that contains the int ID of an element
  static int[][] map;
  String filename;
  String roomname;
  static int w;
  static int h;

  public Room(String fn, String rn, int wn, int hn) {
    filename = fn;
    roomname = rn;
    w = wn;
    h = hn;
    map = new int[w][h];
  }
  
  /* Takes the values in the file and loads them into the map array */
  public static Room load(String filenamet) {
    cl = this.getClass().getClassLoader();
    br = new BufferedReader(new FileReader(cl.getResource(filenamet)));
    st = new StringTokenizer(br.readLine());
    Room newroom = new Room(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    for (int i = 0; i < h; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < w; j++) {
        map[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    br.close();
	
	return newroom;
  }
  public int getH() {
    return h;
  }
  public int getW() {
    return w;
  }
  public int[][] getMap() {
    return map;
  }
  public int getID(int x, int y) {
    return map[x][y];
  }
  
  /* Loads the room into this file */
  public static void save(String filename) {
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
	
	for (int i = 0; i < h; i++) {
		for (int j = 0; j < w; j++) {
			pw.write(map[i][j] + " ");
		}
		pw.write("\n");
	}
	pw.close();
	
  }
}





