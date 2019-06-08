#define redLed P2_4
#define btnInput P2_3
int counter = 0;
bool x;
void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(P2_4, OUTPUT);
pinMode(btnInput, INPUT_PULLUP);
}

void buttoncounter(){
 
 while(1){
  x = digitalRead(btnInput);
  
  if(x == 1){
    delay(5);
    x = digitalRead(btnInput);
    if(x==1){
      counter++;
      Serial.print("COUNTER: ");
      Serial.println(counter);
      return;
    }
  }
 }
 
}


void loop() {
  // put your main code here, to run repeatedly:
  x = digitalRead(btnInput);

  if(x == 0){
    
    delay(5);
    x = digitalRead(btnInput);
    
    if(x == 0){
      buttoncounter();
    }
  }
}
