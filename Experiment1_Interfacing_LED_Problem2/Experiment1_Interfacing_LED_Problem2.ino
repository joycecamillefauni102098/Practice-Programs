int t1 = 2000;
int t2 = 500;
int t3 = 100;
int btnpin1 = 10;   
int joyce;
int jl;
int jayvee;
int btnpin2 = 11;    
int btnpin3 = 12; 
int lednum[]={4,5,6,7,8,9,10,11};


  void setup(){
 for(int jv = 0; jv < 8; jv++){
  pinMode(lednum[jv], OUTPUT);  
 }
  pinMode (btnpin1,INPUT_PULLUP);
  pinMode (btnpin2,INPUT_PULLUP);
  pinMode (btnpin3,INPUT_PULLUP);

  }


void loop() {
 joycee = digitalRead(btnpin1);
 jle = digitalRead(btnpin2);
 jayvs = digitalRead(btnpin3);
  if(joycee == 0){
   delay(t1); //1st Sequence
   for(int jl = 0; jl < 8; jl++){
    digitalWrite(lednum[jl], 1);
    if(jl == 7){ break;}
    delay(t1*(2+jl));
   }
   delay(t2);
   for(int j = 7; j >= 0; j--){
    digitalWrite(lednum[j], 0);
    delay(t2);
    }
  }

  if(jle == 0){
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
 if(jayvs == 0){
for(int i=0; i<255; i++) //3rd Sequence
   {
    for(int g = 0; g < 8; g++ ){
      int v = i/pow(2, g);
    int state = v % 2;
    digitalWrite(g,state);
    delay(t3);
   }
   }
}
}
