package mata_mata;

public class Torneio   {
  
	
 public char tm1;
 public char tm2;
  public char Qv;
  public int t1=0;
  public int t2=0;
  public int plac=0;
  public double ale=Math.random();
  public char[] Venc=new char[8];
  public int p1=0;
  public int p2=0;
  public String pen1;
  public String pen2;
  
	public void Partida (int t1,int t2,char tm1,char tm2,double ale,int p1,int p2){
		
		 ale=Math.random();
		
		
		plac=(int)(1+ale*(11-1));
		
 if (tm1=='p'&& tm2=='p') {
	 
	 switch(plac) {
	 case 1:
	t1=1;
	t2=1;
		 break;
	 case 2:
		 t1=1;
			t2=0;
		 break;
	 case 3:
		 tm1=0;
			t2=1;
		 break;
	 case 4:
		 t1=2;
			t2=2;
		 break;
	 case 5:
		 t1=0;
			t2=2;
		 break;
	 case 6:
		 t1=2;
			t2=0;
		 break;
	 case 7:
		 t1=2;
			t2=1;
		 break;
	 case 8:
		 t1=1;
			t2=2;
		 break;
	 case 9:
		 t1=2;
			t2=2; 
		 break;
	 case 10:
		t1=1;
			t2=1; 
		 break;
	 }	 

 }else  if (tm1=='p'&& tm2=='m') {
	 switch(plac) {
     case 1:
    t1=1;
	t2=1;
		 break;
	 case 2:
		 t1=1;
			t2=0;
		 break;
	 case 3:
		 t1=0;
			t2=1;
		 break;
	 case 4:
		 t1=2;
			t2=2;
		 break;
	 case 5:
		 t1=0;
			t2=2;
		 break;
	 case 6:
		 t1=2;
			t2=1;
		 break;
	 case 7:
		 t1=2;
			t2=3;
		 break;
	 case 8:
		 t1=1;
			t2=2;
		 break;
	 case 9:
		 t1=3;
			t2=2; 
		 break;
	 case 10:
		t1=0;
			t2=0; 
		 break;	 	 
	 }
	 
 } else if (tm1=='m'&& tm2=='p') {
	 switch(plac) {
     case 1:
    t1=1;
	t2=1;
		 break;
	 case 2:
		 t2=1;
			t1=0;
		 break;
	 case 3:
		 t2=0;
			t1=1;
		 break;
	 case 4:
		 t2=2;
			t1=2;
		 break;
	 case 5:
		 t2=0;
			t1=2;
		 break;
	 case 6:
		 t2=2;
			t1=1;
		 break;
	 case 7:
		 t2=2;
			t1=3;
		 break;
	 case 8:
		 t2=1;
			t1=2;
		 break;
	 case 9:
		 t2=3;
			t1=2; 
		 break;
	 case 10:
		t2=0;
			t1=0; 
		 break;	 
 } 
	 
	 
	 
 } else if (tm1=='p'&& tm2=='g') {
	 switch(plac) {
     case 1:
    t1=1;
	t2=1;
		 break;
	 case 2:
		 t1=1;
			t2=0;
		 break;
	 case 3:
		 t1=0;
			t2=1;
		 break;
	 case 4:
		 t1=2;
			t2=2;
		 break;
	 case 5:
		 t1=0;
			t2=2;
		 break;
	 case 6:
		 t1=2;
			t2=1;
		 break;
	 case 7:
		 t1=2;
			t2=3;
		 break;
	 case 8:
		 t1=1;
			t2=2;
		 break;
	 case 9:
		 t1=1;
			t2=3; 
		 break;
	 case 10:
		t1=0;
			t2=0; 
		 break;		 
	 }
	 
 } else if (tm1=='g'&& tm2=='p') {
	 switch(plac) {
     case 1:
    t1=1;
	t2=1;
		 break;
	 case 2:
		 t1=1;
			t2=0;
		 break;
	 case 3:
		 t1=0;
			t2=1;
		 break;
	 case 4:
		 t1=2;
			t2=2;
		 break;
	 case 5:
		 t1=0;
			t2=2;
		 break;
	 case 6:
		 t1=2;
			t2=1;
		 break;
	 case 7:
		 t1=2;
			t2=3;
		 break;
	 case 8:
		 t1=1;
			t2=2;
		 break;
	 case 9:
		 t1=3;
			t2=2; 
		 break;
	 case 10:
		t1=0;
			t2=0; 
		 break;	 	 
	 }	 
  
 } else if (tm1=='m'&& tm2=='m') {
	 switch(plac) {
	 case 1:
	t1=1;
	t2=1;
		 break;
	 case 2:
		 t1=1;
			t2=0;
		 break;
	 case 3:
		 t1=0;
			t2=1;
		 break;
	 case 4:
		 t1=2;
			t2=2;
		 break;
	 case 5:
		 t1=0;
			t2=2;
		 break;
	 case 6:
		 t1=2;
			t2=0;
		 break;
	 case 7:
		 t1=2;
			t2=1;
		 break;
	 case 8:
		 t1=1;
			t2=2;
		 break;
	 case 9:
		 t1=2;
			t2=2; 
		 break;
	 case 10:
		t1=1;
			t2=1; 
		 break;
	 }	 
 
 }else if (tm1=='m'&& tm2=='g') {
	 switch(plac) {
         case 1:
	    t1=1;
		t2=1;
			 break;
		 case 2:
			 t1=1;
				t2=0;
			 break;
		 case 3:
			 t1=0;
				t2=1;
			 break;
		 case 4:
			 t1=2;
				t2=2;
			 break;
		 case 5:
			 t1=0;
				t2=2;
			 break;
		 case 6:
			 t1=2;
				t2=1;
			 break;
		 case 7:
			 t1=2;
				t2=3;
			 break;
		 case 8:
			 t1=1;
				t2=2;
			 break;
		 case 9:
			 t1=3;
				t2=2; 
			 break;
		 case 10:
			t1=0;
				t2=0; 
			 break;	 
	 }
	; 
 }else if (tm1=='g'&& tm2=='m') {
	 
	 switch(plac) {
     case 1:
    t1=1;
	t2=1;
		 break;
	 case 2:
		 t2=1;
			t1=0;
		 break;
	 case 3:
		 t2=0;
			t1=1;
		 break;
	 case 4:
		 t2=2;
			t1=2;
		 break;
	 case 5:
		 t2=0;
			t1=2;
		 break;
	 case 6:
		 t2=2;
			t1=1;
		 break;
	 case 7:
		 t2=2;
			t1=3;
		 break;
	 case 8:
		 t2=1;
			t1=2;
		 break;
	 case 9:
		 t2=3;
			t1=2; 
		 break;
	 case 10:
		t2=0;
			t1=0; 
		 break;	 
 }	 
	 	 
 }else if (tm1=='g'&& tm2=='g') {
	 switch(plac) {
	 case 1:
	t1=1;
	t2=1;
		 break;
	 case 2:
		 t1=1;
			t2=0;
		 break;
	 case 3:
		 t1=0;
			t2=1;
		 break;
	 case 4:
		 t1=2;
			t2=2;
		 break;
	 case 5:
		 t1=0;
			t2=2;
		 break;
	 case 6:
		 t1=2;
			t2=0;
		 break;
	 case 7:
		 t1=2;
			t2=1;
		 break;
	 case 8:
		 t1=1;
			t2=2;
		 break;
	 case 9:
		 t2=2;
			t2=2; 
		 break;
	 case 10:
		t1=1;
			t2=1; 
		 break;
		 
		 }	

 
 }


if(t1!=t2 ) {
				setPen1("");
			setPen2("");
			}else
				
if(t1==t2 ) {
		if(p1==p2) {
			 
			 ale= Math.random();
				
				
			p1=(int)(1+ale*(6-1));	
                  ale=Math.random();
			p2=(int)(1+ale*(6-1));
			if(p1==p2) {
			 ale= Math.random();
				
				
				p1=(int)(1+ale*(6-1));	
               ale=Math.random();
			p2=(int)(1+ale*(6-1));
			}
			if(p1==p2) {
				 ale= Math.random();
					
					
					p1=(int)(1+ale*(6-1));	
	               ale=Math.random();
				p2=(int)(1+ale*(6-1));
				}

				setPen1("["+Integer.toString(p1)+"]");
				setPen2("["+Integer.toString(p2)+"]");
			}}

        setP1(p1);
		setP2(p2);
		setT1(t1);
		setT1(t2);		

}


	
	
	//char tm1,char tm2,

	
		

	public char getTm1() {
		return tm1;
	}

	public void setTm1(char tm1) {
		this.tm1 = tm1;
	}

	public char getTm2() {
		return tm2;
	}

	public void setTm2(char tm2) {
		this.tm2 = tm2;
	}

	public char getQuartas() {
		return Qv;
	}

	public void setQuartas(char tm) {
	     
		this.Qv=tm;
		
		}

	public int getT1() {
		return t1;
	}

	public void setT1(int t1) {
		this.t1 = t1;
	
	}

	public int getT2() {
		return t2;
	}

	public void setT2(int t2) {
		this.t2 = t2;
	}
	
	
	 
	public int getP1() {
		return p1;
	}

public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}




	public String getPen1() {
		return pen1;
	}




	public void setPen1(String pen1) {
		this.pen1 = pen1;
	}




	public String getPen2() {
		return pen2;
	}




	public void setPen2(String pen2) {
		this.pen2 = pen2;
	}
}

	
	




