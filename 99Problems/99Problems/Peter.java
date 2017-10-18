
public class Peter {

	public static void main(String[] args)
    {
        String Cap1=" ";
        int x=0;
        int y=0;
        int z=0;
        String Q=" ";
        System.out.println("Example 1: Testing has shown that the objects at indexes 3 and 4 are switched in the array. Using pseudocode, or any actual language you prefer, how can we programmatically switch them?");
       
        String[] anArray;
        anArray= new String[5];
        anArray[0]="friday";
        anArray[1]="thursday";
        anArray[2]="wednesday";
        anArray[3]="monday";
        anArray[4]="tuesday";
        System.out.println();
        do{
            System.out.println(anArray[x]);
            x++;
            }while(x<5);
        x=0;
        System.out.println();
        System.out.println();
        System.out.println("We can fix this by switching anArray[3] with anArray[4]");
        System.out.println();
        String n;
        String m;
        m=anArray[3];
        n=anArray[4];
        anArray[3]=n;
        anArray[4]=m;
        do{
        System.out.println(anArray[x]);
        x++;
        }while(x<5);
        System.out.println();
        System.out.println();
        System.out.println("Example 2: Further testing has revealed that the objects need their first letter capitalized. Assume there is a function capitalize(string) that will capitalize the first letter of a string. Using pseudocode, or any actual language you prefer, how can we programmatically fix the objects?");
        System.out.println();
    
        do
        {
            Cap1 = anArray[y].substring(0,1).toUpperCase();
            System.out.println(Cap1+anArray[y].substring(1,anArray[y].length()));
            y++;
        }
        while(y<5);
        System.out.println();
        System.out.println("Question: Testing has revealed that the objects are in reverse order. Using pseudocode, or any actual language you prefer, how can we programmatically fix the objects?");
        System.out.println();
        
        y=4;
        do
        {
            Cap1 = anArray[y].substring(0,1).toUpperCase();
            System.out.println(Cap1+anArray[y].substring(1,anArray[y].length()));
            y--;
        }
        while(y>-1);
    }

}


