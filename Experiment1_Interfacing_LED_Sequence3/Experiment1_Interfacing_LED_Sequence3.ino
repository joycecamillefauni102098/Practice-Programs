int t1 = 1000;
int t2 = 500;
int lednum[]={4,5,6,7,8,9,10,11};
 void setup(){
 for(int joyce = 0; joyce < 8; joyce++){
  pinMode(lednum[joyce], OUTPUT);}
 }
 void loop() {
for(int i=0; i<255; i++) //3rd Sequence
   {
    for(int g = 0; g < 8; g++ ){
      int v = i/pow(2, g);
    int state = v % 2;
    digitalWrite(g,state);
    delay(T3);
   }
   }
 }
 
