package stackperson;
import java.util.Scanner;

public class TicketCounterStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack st=null;
		System.out.println("choose intialization:");
		System.out.println("1.Empty stack with size");
		System.out.println("2. Stack initialized with array of Persons");
		int choice=sc.nextInt();
		
		if(choice==1) {
			System.out.print("enter size:");
			int size=sc.nextInt();
			st=new Stack(size);
			}
		else if(choice==2) {
			System.out.println("enter number of persos:");
			int n=sc.nextInt();
			Person arr[]=new Person[n];
			st=new Stack(n);
			for(int i=0;i<n;i++) {
				sc.nextLine();
				System.out.println("enter details for person"+(i+1));
				System.out.println("name:");
				String name=sc.nextLine();
				System.out.println("age:");
				int age =sc.nextInt();
				System.out.println("Gender(FEMALE/MALE/OTHERS):");
				String g=sc.next().toUpperCase();
				arr[i]=new Person(name,age,Gender.valueOf(g));
			}
			st=new Stack(arr);
		}
		int option;
		do {
			System.out.println("\n---Menu---");
			System.out.println("1.push one Person");
			System.out.println("2.push two Person");
			System.out.println("3.pop one Person");
			System.out.println("4.pop multiple persons");
			System.out.println("5.Display all Persons");
			System.out.println("6.Display top n Persons");
			System.out.println("7.exit");
			System.out.println("enter your choice:");
			option=sc.nextInt();
			switch(option) {
			case 1:
				sc.nextLine();
				System.out.println("enter details of person1:");
				System.out.println("enter name:");
				String name1=sc.nextLine();
				System.out.println("enter age:");
				int age1=sc.nextInt();
				System.out.println("enter gender(MALE/FEMALE/OTHER:");
				String g1=sc.next().toUpperCase();
				Person p1=new Person(name1,age1,Gender.valueOf(g1));
				st.push(p1);
				break;
			case 2:
				sc.nextLine();
				System.out.println("enter details of person1:");
				System.out.println("name:");
				String name=sc.nextLine();
				System.out.println("age");
				int age=sc.nextInt();
				System.out.println("enter gender(MALE/FEMALE/OTHERS:");
				String g2=sc.next().toUpperCase();
				sc.nextLine();
				System.out.println("enter details of person 2:");
				System.out.println("enter name:");
				String name2=sc.nextLine();
				System.out.println("enter age:");
				int age2=sc.nextInt();
				System.out.println("enter gender(MALE/FEMALE/OTHER:");
				String g3=sc.next().toUpperCase();
				
				
				Person per1=new Person(name,age,Gender.valueOf(g2));
				Person per2=new Person(name2,age2,Gender.valueOf(g3));
				st.push(per1,per2);
				break;
			case 3:
				Person popped=st.pop();
				if(popped!=null)popped.displayPerson();
				break;
			case 4:
                System.out.println("enter number of Persons to pop:");
                int  nPop=sc.nextInt();
                st.pop(nPop);
                break;
			case 5:
			     st.display();
			     break;
			case 6:
				System.out.println("enter number of top Persons:");
				int topN=sc.nextInt();
				st.display(topN);
				break;
			case 7:
				System.out.println("exiting");
				break;
				
				default:
					System.out.println("invalid choice!");
			}}
			while(option!=7);
			sc.close();
		
				
				
			
		}
	}
