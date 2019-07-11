int t1 = 2000;
int t2 = 500;
int lednum[]={4,5,6,7,8,9,10,11};
 void setup(){
 for(int joyce = 0; joyce < 8; joyce++){
  pinMode(lednum[joyce], OUTPUT);  
 }
 }
 void loop() {
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
 
