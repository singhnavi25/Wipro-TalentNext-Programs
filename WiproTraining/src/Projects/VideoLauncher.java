package Projects;

import java.util.Scanner;

class Video
{
	private String videoName;
	private boolean checkout;
	private int rating;
	private int users;
	Video(String name)
	{
		this.videoName = name;
		this.rating = 0;
		this.checkout = false;
		this.rating = 0;
	}
	String getName()
	{
		return videoName;
	}
	void doCheckout()
	{
		checkout = true;
	}
	void doReturn()
	{
		checkout = false;
	}
	void receiveRating(int rating)
	{
		if(users == 0)
		{
			this.rating = rating;
			users = 1;
		}
		else
		{
			this.rating = this.rating * users;
			users++;
			this.rating = (this.rating + rating) / users;
		}
	}
	int getRating()
	{
		return rating;
	}
	boolean getCheckout()
	{
		return checkout;
	}
}

class VideoStore
{
	private Video[] store = new Video[1];
	private int n = 0;
	void addVideo(String name)
	{
		if(store.length == n)
		{
			Video[] temp = new Video[2 * n];
			for(int i = 0; i<n; i++)
				temp[i] = store[i];
			store = temp;
		}
		store[n++] = new Video(name);
		System.out.println("Video \"" + name + "\" added successfully.\n");
	}
	void doChekout(String name)
	{
		for(int i =0; i<n; i++)
			if(store[i].getName().equalsIgnoreCase(name) && !store[i].getCheckout())
			{
				store[i].doCheckout();
				System.out.println("Video \"" + name + "\" checked out successfully.\n");
				return;
			}
		System.out.println("Video \"" + name + "\" already checked out.\n");
	}
	void doReturn(String name)
	{
		for(int i =0; i<n; i++)
			if(store[i].getName().equalsIgnoreCase(name) && store[i].getCheckout())
			{
				store[i].doReturn();
				System.out.println("Video \"" + name + "\" returned successfully.\n");
				return;
			}
		System.out.println("Video \"" + name + "\" already returned.\n");
	}
	void recieveRating(String name, int rating)
	{
		for(int i =0; i<n; i++)
			if(store[i].getName().equalsIgnoreCase(name))
			{
				store[i].receiveRating(rating);
				System.out.println("Rating \"" + rating + "\" has been mapped to the video \"" + name + "\".\n");
				return;
			}
		System.out.println("Video \"" + name + "\" not found in Video Store.\n");
	}
	void listInventory()
	{
		for(int i=0; i<n; i++)
		{
			System.out.println("-----------------------------------------------");
			System.out.format("%-20s%-20s%-10s", "VideoName", "Checkout Status", "Rating");
			//System.out.println("Video Name Checkout Status | Rating");
			System.out.println();
			System.out.format("%-20s%-20s%-20s", store[i].getName(),  store[i].getCheckout(), store[i].getRating());
			System.out.println("\n-----------------------------------------------\n");
		}
	}
}
public class VideoLauncher 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		VideoStore videoStore=new VideoStore();
		do {
				System.out.println("MAIN MENU \n=========");
				System.out.println("1. Add Videos:");
				System.out.println("2. Check Out Video:");
				System.out.println("3. Return Video:");
				System.out.println("4. Receive Rating:");
				System.out.println("5. List Inventory:");
				System.out.println("6. Exit:");
				System.out.print("Enter your choice(1..6): ");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.print("Enter the name of the video you want to add: ");
					videoStore.addVideo(sc.next());
					break;
				case 2:
						System.out.print("Enter the name of the video you want to check out: ");
						videoStore.doChekout(sc.next());
						break;
				case 3:
					System.out.print("Enter the name of the video you want to Return:");
					videoStore.doReturn(sc.next());
					break;
				case 4:
					System.out.print("Enter the name of the video you want to Rate: ");
					String name = sc.next();
					System.out.print("Enter the rating for this video :");
					videoStore.recieveRating(name, sc.nextInt());
					break;
				case 5:
					videoStore.listInventory();
					break;
				case 6:
					System.err.println("Enter ...!! Thanks for using the application");
					System.exit(1);
					break;
				}
		}while(!(choice==6));		
		sc.close();
	}
}
