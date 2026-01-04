import java.util.Scanner;
public class UserInterface {
    public static void main(String args[])
    {
        // fill the code here
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of teams");
        int teams=sc.nextInt();
        
        //team number validation
        if(teams<2) {
        	System.out.println(teams+" is an invalid input");
        	return;
        }
        
        //teams
        String team[]=new String[teams];
        
        //winning team and time
        String winningTeam="";
        float minTime=Float.MAX_VALUE;
        
        //nextline bug
        sc.nextLine();
        
        //details of team
        System.out.println("Enter the details");
        for(int i=0;i<teams;i++) {
        	team[i]=sc.nextLine();
        	
        	//separating individual teams
        	String teamDetails[]=team[i].split(":");
        	
        	//extracting informations
        	String name=teamDetails[0];
    
        	float time1=Float.parseFloat(teamDetails[1]);
        	
        	float time2=Float.parseFloat(teamDetails[2]);
        	float time3=Float.parseFloat(teamDetails[3]);
        	float time4=Float.parseFloat(teamDetails[4]);
        	
        	//valdations
        	if(time1<1 || time2<1 || time3<1 || time4<1) {
        		System.out.println("Invalid number");
        		return;
        	}
        	
        	//total time
        	float totalTime=time1+time2+time3+time4;
        	
        	//if new minTime found
        	if(totalTime<minTime) {
        		minTime=totalTime;
        		winningTeam=name;
        	}
        	
        	
        }
        
        System.out.printf(winningTeam+" team wins the race in %.2f minutes",minTime);
       
    }
    

}
