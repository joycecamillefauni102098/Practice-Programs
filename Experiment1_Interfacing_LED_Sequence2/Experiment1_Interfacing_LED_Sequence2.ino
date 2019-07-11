int t1 = 1000;
int t2 = 500;
int lednum[]={4,5,6,7,8,9,10,11};
 void setup(){
 for(int joyce = 0; joyce < 8; joyce++){
  pinMode(lednum[joyce], OUTPUT);  
 }
 }
 void loop() {
   //2nd Sequence

  for(int jayvee = 0; jayvee < 3; jayvee++){
    
    //for the odd number pins
    for(int kuro = 0; kuro < 8; kuro++){
      int j = lednum[kuro]%2;
      if(j>0){
        digitalWrite(lednum[kuro], 1);
      } else{digitalWrite(lednum[kuro], 0);}
    }
    delay(t1);
    
    if(jayvee < 2){
    //for the even number pins 
    for(int kuro = 0; kuro < 8; kuro++){
      int j = lednum[kuro]%2;
      if(j==0){digitalWrite(lednum[kuro], 1);} 
      else{digitalWrite(lednum[kuro], 0);}
    }
    delay(t1);} else{
      digitalWrite(3,0);
      digitalWrite(5,0);
      digitalWrite(7,0);
      digitalWrite(9,0);
    }
 }
 }
 
