package miniproj;
import java.util.Scanner;
public class Game {
	
	static void option()
	{
	int i=1;
	Option:
	while(i>0)
	{
	System.out.println("1.Enter the Arena press 'Arena'_____");
	System.out.println("2.About the game press 'About'");
	System.out.println("3.Exit the game press 'Exit'");
	Scanner in = new Scanner(System.in);
	String opt1= in.nextLine();
	if(opt1.equals("Arena"))
	{
	Zombie();
	wither();
	Dragon();
	}
	else if(opt1.equals("About"))
	{
	rules();
	}
	else if(opt1.equals("Exit"))
	{
	i=0;
	}else{
	    System.out.println("Please enter valid input");
	}
	}
	}
	static void Zombie()
	{
	int hp=40,damage=12,z_hp=60,z_dmg=10,potion=10,heal=10,i=1,m=1,defence=0;
	System.out.println("1.Grind for potion.");
	System.out.println("2.Start the boss fight.");
	Scanner in = new Scanner(System.in);
	int opt3 = in.nextInt();
	if(opt3==1)
	{
	int w1_hp=24,w1_dmg=10,n=0,k=1;
	            System.out.println("You've entered the witch hut");
	            System.out.println("Kill the witch to accure more potion");
	            witch:
	            while (k>0) {
	            System.out.println("Select an option : ");
	            System.out.println("A.Attack the witch.");
	            System.out.println("H.Heal using portion .");
	            System.out.println("S.Start the fight");
	            String opt2=in.nextLine();
	            if (opt2.equals("A")) {
	            	w1_hp=w1_hp-damage;
	            	hp=hp-w1_dmg;
	            	System.out.println("Hp of witch after attcking is "+w1_hp);
	            	System.out.println("Your Hp is "+hp);
	            }
	            else if (opt2.equals("H")) {
	            	if(potion>0)
				{
				hp=hp+heal;
				potion=potion-heal;	
				int no_potions=potion/heal;
				System.out.println("Your hp after healing is  "+hp);
				System.out.print("You have "+no_potions);
				System.out.print(" potion left\n");
				if(potion<=0) {
				System.out.println("Your potions are over");
	                }       
	                  }
	            }
	            else if (opt2.equals("S")) {
	            	k=0;
	            	
	            }
	            if(w1_hp<=0)
	            {
	            	System.out.println("You defeated the witch");
	                System.out.println("You Got healed by killing the witch");
	            	System.out.println("Another witch is comming");
	                n=n+1;
	            	hp=40;
	                w1_hp=24;
	                System.out.println("********* One potion has been added. *********\n");
	            }
	            if((n%2)==0)
	            {
	            	potion=potion+heal;
	            }
	        }   
	    }
	System.out.println("The fight has started :");
	System.out.println("Your damage is "+damage);
	System.out.println("The Zombie boss has appeared:");
	System.out.println("The Zombie boss can damage of  Hp"+z_dmg);

	Game:

	while(i>0)  {
	System.out.println("Your hp is "+hp);
	System.out.println("The Hp of the Zombie boss hp is  "+z_hp);
	System.out.println("Chosse an option:");
	System.out.println("1.Attack");
	System.out.println("2.Heal using portion.");
	System.out.println("3. if you want run away.....");
	int opt = in.nextInt();
	if(opt==1)
	{
	if(hp>0 && z_hp>0)
	hp=hp-z_dmg;
	z_hp=z_hp-damage;
	System.out.println("The zombie hp is  "+z_hp);
	System.out.println("Your Hp is  "+hp);
	}
	else if(opt==2)
	{
	if(potion>0)
	{
	hp=hp+heal;
	potion=potion-heal;
	int no_potions=potion-heal;
	System.out.println("Your hp after healing is  "+hp);
	System.out.println("You have "+no_potions);
	if(potion<=0) {
		System.out.println("Your potions are over");
	}
	}
	}
	else if(opt==3)
	{
		i=0;
	    System.out.println("You ran away from the Zombie boss.");
	}else{
		System.out.println("Number is invalid");
	}
	if(z_hp<=0)
	{
	i=0;
	System.out.println("You Defeated the Zombie Boss.");
	System.out.println("Get ready for the wither boss\n\n ");
	}else if(hp<=0 || opt==3){
		System.out.println("You got Defeated by Zombie Boss\n");
	i=0;
	}else {
		System.out.print("\n\n");
	}
	}
	}

	   static void wither()
	{
	int hp=90,damage=15,w_hp=100,w_dmg=20,potion=20,heal=10,i=1,m=1,defence=0;
	System.out.println("1.Grind for potion.");
	System.out.println("2.Start the boss fight.");
	Scanner in = new Scanner(System.in);
	int opt3 = in.nextInt();
	if(opt3==1)
	{
	int w1_hp=30,w1_dmg=20,n=0,k=1;
	            System.out.println("You've entered the witch hut");
	            System.out.println("Kill the witch to accure more potion");
	            witch:
	            while (k>0) {
	            System.out.println("Select an option : ");
	            System.out.println("A.Attack the witch.");
	            System.out.println("H.Heal using portion .");
	            System.out.println("S.Start the fight");
	            String opt2=in.nextLine();
	            if (opt2.equals("A")) {
	                w1_hp=w1_hp-damage;
	                hp=hp-w1_dmg;
	                System.out.println("Hp of witch after attcking is "+w1_hp);
	                System.out.println("Your Hp is "+hp);
	            }
	            else if (opt2.equals("H")) {
	                if(potion>0)
	            {
	            hp=hp+heal;
	            potion=potion-heal; 
	            int no_potions=potion/heal;
	            System.out.println("Your hp after healing is  "+hp);
	            System.out.print("You have "+no_potions);
	            System.out.print(" potion left\n");
	            if(potion<=0) {
	            System.out.println("Your potions are over");
	                }       
	                  }
	            }
	            else if (opt2.equals("S")) {
	                k=0;
	                
	            }  
	            if(w1_hp<=0)
	            {
	                System.out.println("You defeated the witch");
	                System.out.println("You Got healed by killing the witch");
	                System.out.println("Another witch is comming");
	                n=n+1;
	                hp=40;
	                w1_hp=24;
	                System.out.println("********* One potion has been added. *********\n");
	            }
	            if((n%2)==0)
	            {
	            	potion=potion+heal;
	            }
	            if (hp<=0) {
	             System.out.println("You was defeated by witch.");
	             continue witch;            	
	            }
	        }   
	}

	System.out.println("Your damage is "+damage);
	System.out.println("The wither boss has appeared:");
	System.out.println("The wither boss can damage of  Hp"+w_dmg);

	Game:

	while(i>0)  {
	System.out.println("Your hp is "+hp);
	System.out.println("The Hp of the wither boss hp is  "+w_hp);
	System.out.println("Chosse an option:");
	System.out.println("1.Attack");
	System.out.println("2.Heal using portion.");
	System.out.println("3. if you want run away.....");
	int opt = in.nextInt();
	if(opt==1)
	{
	if(hp>0 && w_hp>0)
	hp=hp-w_dmg;
	w_hp=w_hp-damage;
	System.out.println("The wither hp is  "+w_hp);
	System.out.println("Your Hp is  "+hp);
	}
	else if(opt==2)
	{
	if(potion>0)
	{
	hp=hp+heal;
	potion=potion-heal;
	int no_potions=potion-heal;
	System.out.println("Your hp after healing is  "+hp);
	System.out.println("You have "+no_potions);
	if(potion<=0) {
		System.out.println("Your potions are over");
	}
	}
	}
	else if(opt==3)
	{
		i=0;
	    System.out.println("You ran away from the Wither Boss.");
	    System.out.println("Dragon found you");
	    System.out.println("Get ready for dragon fight.");
	}else{
		System.out.println("The number you entered is invalid.");
	}
	if(w_hp<=0)
	{
	i=0;
	System.out.println("You Defeated the Wither Boss.");
	    System.out.println("Get ready for dragon.");
	}
	if (hp<=0)
	    {
	    System.out.println("You got Defeated by Wither Boss");
	i=0;
	}
	}
	}

	static void Dragon()
	{
	int hp=150,damage=25,d_hp=200,d_dmg=50,potion=20,heal=10,i=1,m=1,defence=0;
	System.out.println("1.Grind for potion.");
	System.out.println("2.Start the boss fight.");
	Scanner in = new Scanner(System.in);
	int opt3 = in.nextInt();
	if(opt3==1)
	{
	int w1_hp=50,w1_dmg=20,n=0,k=1;
	            System.out.println("You've entered the witch hut");
	            System.out.println("Kill the witch to accure more potion");
	            witch:
	            while (k>0) {
	                       System.out.println("Select an option : ");
	            System.out.println("A.Attack the witch.");
	            System.out.println("H.Heal using portion .");
	            System.out.println("S.Start the fight");
	            String opt2=in.nextLine();
	            if (opt2.equals("A")) {
	                w1_hp=w1_hp-damage;
	                hp=hp-w1_dmg;
	                System.out.println("Hp of witch after attcking is "+w1_hp);
	                System.out.println("Your Hp is "+hp);
	            }
	            else if (opt2.equals("H")) {
	                if(potion>0)
	            {
	            hp=hp+heal;
	            potion=potion-heal; 
	            int no_potions=potion/heal;
	            System.out.println("Your hp after healing is  "+hp);
	            System.out.print("You have "+no_potions);
	            System.out.print(" potion left\n");
	            if(potion<=0) {
	            System.out.println("Your potions are over");
	                }       
	                  }
	            }
	            else if (opt2.equals("S")) {
	                k=0;
	                
	            }
	            
	            if(w1_hp<=0)
	            {
	                System.out.println("You defeated the witch");
	                System.out.println("You Got healed by killing the witch");
	                System.out.println("Another witch is comming");
	                n=n+1;
	                w1_hp=24;
	                hp=150;
	                System.out.println("********* One potion has been added. *********\n");
	            }
	            if((n%2)==0)
	            {
	            	potion=potion+heal;
	            	}
	            if (hp<=0) {
	             System.out.println("You was defeated by witch.");
	             continue witch;            	
	            }
	        }   
	}

	System.out.println("The Dragon boss has appeared:");
	System.out.println("The Hp of the Dragon boss hp is  "+d_hp);
	System.out.println("The Dragon boss can damage of  Hp"+d_dmg);
	Game:

	while(i>0)  {
	System.out.println("Your hp is "+hp);
	System.out.println("Your damage is "+damage);
	System.out.println("Chosse an option:");
	System.out.println("1.Attack");
	System.out.println("2.Heal using portion.");
	System.out.println("3. if you want run away.....\n\n");
	int opt = in.nextInt();
	if(opt==1)
	{
	if(hp>0 && d_hp>0)
	hp=hp-d_dmg;
	d_hp=d_hp-damage;
	System.out.println("The Dragon hp is  "+d_hp);
	System.out.println("Your Hp is  "+hp);
	}
	else if(opt==2)
	{
	if(potion>0)
	{
	hp=hp+heal;
	potion=potion-heal;
	int no_potions=potion/heal;
	System.out.println("Your hp after healing is  "+hp);
	System.out.print("You have "+no_potions);
	if(potion<=0) {
		System.out.println("Your potions are over");
	}
	}
	}
	else if(opt==3)
	{
		i=0;
	    System.out.println("You ran away from the dragon.");
	    System.out.println("You left the Arena ");
	}else{
		System.out.println("The number you entered is invalid.");
	}
	if(d_hp<=0)
	{
	i=0;
	System.out.println("You Defeated the Dragon Boss.");
	    System.out.println("You've won the Game.");
	}
	if (hp<=0 || opt==3)
		{
		System.out.println("You got Defeated by Dragon Boss");
	i=0;
	}
	}
	}
	static void rules()
	{
	System.out.println("About Game");
	System.out.println("Name : The dragon island");
	System.out.println("About the game:");
	System.out.println("You can get heal portion by playing the mini game of defeating witch");
	System.out.println("There is only a 50% chance of getting a heal portion from witch after defeating it.");
	System.out.println("A single portion can heal upto only 10 Hp");
	System.out.println("After defeating the dragon you've won the Game");
	System.out.println("Steps to play the game");
	System.out.println("Step1: Get portion by killing witch");
	System.out.println("After getting sufficient portion's you start the boss fight");
	System.out.println("But you need to solve a small riddle to open the doors.");
	System.out.println("press 1 to attack and 2 to heal yourself");
	System.out.println("");
	System.out.println("					---- The Game is developed by Sai Krishna");
	}
	static void story()
	{
	    int i=1;
	    int i1=1;
	    Scanner in= new Scanner(System.in);
	    while(i>0) 
	    {  
	   System.out.println("To continue press enter .");
	   System.out.println("You suddenly found yourself in a sky island in front of a big gate to areana with a guard ");
	   in.nextLine();
	   System.out.println("The guard saw you and asked how did you come here and he said that he's in the dragon island");
	   in.nextLine();
	   System.out.println("To escape from dragon island you need to kill all the bosses in the Arena");
	   in.nextLine();

	   System.out.println("There are three bosses in the Game and a mini game.");
	   in.nextLine();
	   System.out.println(" In First boss there is a zombie boss with 60 hp and damage of 10.");
	   in.nextLine();
	   System.out.println("In Second boss there is wither boss with 100 hp and damage of 20");
	   in.nextLine();
	   System.out.println("In Third boss there is Dragon with 150 hp and damage of 40");
	   in.nextLine();
	   System.out.println("To defeat the boss youll be given sword according level and one heal portion");
	   in.nextLine();
	   System.out.println("To defeat the boss you might need more than one heal portion ");
	   in.nextLine();
	   System.out.println("To get heal potions you need to defeat the witch ");
	   in.nextLine();
	   System.out.println("After killing the dragon you can be free and get access to the sky island");
	   in.nextLine();
	   System.out.println("And you can also get acces to wormhole through which you can go anywhere in the whole universe\n");
	   i=0;
	   }
	while(i1>0)
	{    
	    System.out.println("To open the gates ___||____ you have to solve the riddle below.");
	    System.out.println("What has to be destroyed to use it: ");    
	    String opt= in.nextLine();

	    if(opt.equals("egg"))
	    {
	        i=0;
	        i1=0;
	    }else{
	        System.out.println("Please enter a valid input \n");
	    }
	}

	}
	}