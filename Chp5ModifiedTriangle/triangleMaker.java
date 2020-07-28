// Class that creates asterisk triangles
public class triangleMaker {

    public void makeTriangles() {
        int mainLoop;

        for (mainLoop=1; mainLoop <= 10; mainLoop++){

            for(int tr1=1; tr1 <= mainLoop; tr1++)
                System.out.print("*");
            for(int move1=1; move1 <=10-mainLoop;move1++)
                System.out.print(" ");
            System.out.print("\t");

            for(int tr2=10; tr2 >= mainLoop; tr2--)
                System.out.print("*");
            for(int move2= 1; move2 < mainLoop; move2++)
                System.out.print(" ");
            System.out.print("\t");

            for( int move4=1; move4 < mainLoop; move4++)
                System.out.print(" ");
            for(int tr4=10;tr4 >= mainLoop;tr4--)
                System.out.print("*");
            System.out.print("\t");

            for(int move3=10; move3 > mainLoop; move3--)
                System.out.print(" ");
            for(int tr3=1; tr3 <= mainLoop; tr3++)
                System.out.print("*");
            System.out.println();

        }
    }
}