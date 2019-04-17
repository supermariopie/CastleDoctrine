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
  public static Room load(String filenamet) {
    cl = this.getClass().getClassLoader();
    br = new BufferedReader(new FileReader(cl.getResource(filenamet)));
    st = new StringTokenizer(br.readLine());
    Room newroom = new Room(st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
    for (int i = 0; i < h; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < w; j++) {
        map[i][j] = Integer.parseInt(br.readLine());
      }
    }

    br.close();
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
  //code this later
  /*public static Room save(String filename) {
    
  }*/
}