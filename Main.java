import java.util.*;
class bookshopmethods
{
     Scanner in = new Scanner(System.in);
     int n=2;
     String[] title = new String[n];
     String[] author = new String[n];
     String[] publisher = new String[n];
     int[] cost = new int[n];
     int[] count = new int[n];
     void setdata()
      {
        for(int i=0;i < n;i++)
         {
            System.out.println("Enter the title of the " + (i+1) +" book:");
            title[i] = in.nextLine();
            System.out.println("Enter the author of the " + (i+1) +" book:");
            author[i] = in.nextLine();
            System.out.println("Enter the publisher of the " + (i+1) +" book:");
            publisher[i] = in.nextLine();
            System.out.println("Enter the cost of the " + (i+1) + " book:");
            cost[i]=in.nextInt();
            System.out.println("Enter the number of books present in the Book shop:");
            count[i]=in.nextInt();
            in.nextLine();
         }
      }
      void search()
      {
        int i;
        System.out.println("***********Books present in the Book shop are*************"); 
        for(i=0;i<n;i++)
         {
           System.out.println((i+1) + ". Title of the book:" +title[i]);
          }
        System.out.println("Enter the title of the book needed:");
        String titkey;
        titkey = in.nextLine(); 
        int flag=0;
        for(i=0;i<n;i++)
        {
           
           if(titkey.equals(title[i]))
             {
               flag++;
               break;
             }
         }
         if(flag != 0)
         {
              System.out.println("******Details of the book you needed is*****");
              System.out.println("Title of the book:"+title[i]);
              System.out.println("Author of the book:"+author[i]);
              System.out.println("Publisher of the book:"+publisher[i]);
              System.out.println("Cost of the book:"+cost[i]);
              System.out.println("Number of books presernt in the Book shop:"+count[i]);
         }
        else
             System.out.println("Book not present in the store");
   }
}
class Main
{
  public static void main(String arg[])
    {
          int ch=0;
          bookshopmethods ob = new bookshopmethods();
          Scanner sc = new Scanner(System.in);
          while(true)
            { 
              System.out.println("********************MENU IS****************");
              System.out.println("\t\t1.To enter the data\n\t\t2.To search a book\n\t\t3.Exit"); 

             System.out.println("Enter your choice from the above menu:");
             try{ 
                ch = sc.nextInt();
             }catch(NoSuchElementException e){
                System.out.println("Invalid input");
                sc.nextLine();
             } 
                switch(ch)
               {
                  case 1: ob.setdata();
                              break;
                  case 2: ob.search();
                           break;
                  case 3: System.exit(0);
               }
             }
 }
}