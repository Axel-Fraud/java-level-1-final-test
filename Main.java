class Main {
  public static void main(String[] args) {
   /*int[] google = new int [10];
   int[] nums = new int [20];
   int[][] array = new int [5][10];
   array [3][5] = 5;
   System.out.println(array.length);
   System.out.println(array[0].length);

   for(int i = 0; i<array.length; i++){
    System.out.println( i + "  ");
     for(int j = 0; j< array[0].length; j++){
      
       System.out.print(array[i][j] );
     }

   }

   System.out.println();

   for( int i=0; i<nums.length; i++){
     nums[i] = i+1;
     System.out.print(nums[i] + " ");
   }
   System.out.println();
   int[] life = {3, 4, 5};
   int x = life[1];
   System.out.println(x);
   int num1 = (int)(Math.random()*11);
   System.out.println(num1);
   int num2 = (int)(Math.random()*31+20);
   System.out.println(num2);
   char letter = (char)(Math.random()*26+97);
   System.out.println(letter);
   int w = 36;
   int z = 59;
   System.out.println(addUp(w,z));
   System.out.println(coinFlip());
   int total1=0;
   int total2=0;
   for( int i = 1; i<=100; i++){
     if(coinFlip() == "tails"){
       total1+=1;
     }
     else{
       total2+=1;
     }
   }
   System.out.println("you flipped heads "+ total2 + " amount of times");
   System.out.println("you flipped heads "+ total1 + " amount of times");


int[] food = new int[6];
for(int i=0; i<food.length; i++){
  food[i] = (int)(Math.random()*100);
}
for(int j=0; j<food.length; j++){
  System.out.print(food[j] + "  ");
}
System.out.println();
int [][] arr = new int[5][5];
for(int i = 0; i<arr[0].length; i++){
  System.out.print( "  " + i);
}
System.out.println();
for (int b = 0; b < arr.length; b++) {
      System.out.print(b + " ");
      for (int a = 0; a < arr[0].length; a++) {
        
          System.out.print("x  ");
      }
      System.out.println();
    }

  

int[] nums = new int [20];
for(int i = 0; i<20; i++){
  nums[i] = (i+1);
}

for( int i = 0; i<20; i++){
  nums[i] += 100;
}

for(int j = 0; j<20; j++){
  System.out.print(nums[j] + " ");
}


 */

 int[][] array = new int [5][10];
array[3][5] = 5;

System.out.println(array[0].length);

for(int i=0; i<array.length; i++){
 
  for(int j=0; j<array[0].length; j++){
array[i][j] = (int)(Math.random()*100);
  }
}


for(int i=0; i<array.length; i++){

for(int j=0; j<array[0].length; j++){
  System.out.print(array[i][j]+ " ");
}
System.out.println();
}



  }


  


  public static int addUp(int x, int y){
  return x+y;
  }
  public static String coinFlip(){
    double z = Math.random();
    if(z>= 0.5){
      return ("Heads");
    }
    else{
      return ("tails");
    }
  }
}