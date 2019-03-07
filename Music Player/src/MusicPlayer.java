import java.util.Scanner;
public class MusicPlayer {
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter battery: ");
     int battery = in.nextInt();
     System.out.println("Enter total songs: ");
     int totalSongs = in.nextInt();
     int songNo = 1;
     while(battery > 30)
     {
       System.out.println("Music On ");
       System.out.println("Playing Song: "+songNo);
       in.nextLine();
       do
       {
         System.out.println("Do you want to play again?: Yes/No");
         String rep = in.nextLine();
         if(rep.equals("Yes"))
          System.out.println("Playing Song: "+songNo);
        else if(!(rep.equals("No")))
           System.out.println("Invalid input string!!Enter Yes/No correctly!!");
        else if(songNo < totalSongs)
         {
          System.out.println("Do you want to continue with next song?: Yes/No");
          String nextSong = in.nextLine();
          if(nextSong.equals("No"))
           break;
          else
          System.out.println("Playing song: "+(++songNo));
        }
         battery -= 5;
       }while(songNo < totalSongs && battery > 30);
      if(battery <= 30)
      break;
      System.out.println("Do you want to Stop Music?:Yes/No");
      String stop = in.next();
      if(stop.equals("Yes"))
        break;
      else if(songNo >= totalSongs)
      {
        System.out.println("RESTARTING");
        songNo = 1;
      }
      else
          System.out.println("RESUME");
      
      battery -= 5;
     }
     if(battery <= 30)
     System.out.println("Low Battery!!!!");
     System.out.println("Music Player Stopped!!!");
  }
} 