/*
  Blink

  Turns an LED on for one second, then off for one second, repeatedly.

  Most Arduinos have an on-board LED you can control. On the UNO, MEGA and ZERO
  it is attached to digital pin 13, on MKR1000 on pin 6. LED_BUILTIN is set to
  the correct LED pin independent of which board is used.
  If you want to know what pin the on-board LED is connected to on your Arduino
  model, check the Technical Specs of your board at:
  https://www.arduino.cc/en/Main/Products

  modified 8 May 2014
  by Scott Fitzgerald
  modified 2 Sep 2016
  by Arturo Guadalupi
  modified 8 Sep 2016
  by Colby Newman

  This example code is in the public domain.

  http://www.arduino.cc/en/Tutorial/Blink
*/
#define btnInput P2_3       //interup btn
#define redLed P2_4         // red led
#define blueLed P2_5
#define greenLed P2_6
// the setup function runs once when you press reset or power the board
void setup() {
  // initialize digital pin LED_BUILTIN as an output.
  pinMode(redLed, OUTPUT);
  pinMode(blueLed, OUTPUT);
  pinMode(greenLed, OUTPUT);
  pinMode(btnInput, INPUT_PULLUP);
   digitalWrite(redLed, HIGH); 
    digitalWrite(blueLed, HIGH); 
     digitalWrite(greenLed, HIGH); 
}

// the loop function runs over and over again forever
void loop() {
  int x = digitalRead(btnInput);
  if(x == 0){
     digitalWrite(redLed, LOW);   // turn the LED on (HIGH is the voltage level)
      digitalWrite(blueLed, HIGH); 
     digitalWrite(greenLed, HIGH); 
     delay(1000);                       // wait for a second
     digitalWrite(redLed, HIGH);   // turn the LED on (HIGH is the voltage level)
     digitalWrite(blueLed, LOW);   // turn the LED on (HIGH is the voltage level
     digitalWrite(greenLed, HIGH); 
     delay(1000);
     digitalWrite(blueLed, HIGH);   // turn the LED on (HIGH is the voltage level)
     digitalWrite(greenLed, LOW);   // turn the LED on (HIGH is the voltage level)
     digitalWrite(redLed, HIGH); 
     delay(1000);                       // wait for a second
     digitalWrite(greenLed, HIGH);   // turn the LED on (HIGH is the voltage level)
     digitalWrite(redLed, HIGH); 
    digitalWrite(blueLed, HIGH); 
  }
  if(x == 1){
      digitalWrite(redLed, HIGH);
      digitalWrite(blueLed, HIGH);
      digitalWrite(greenLed, HIGH); 
  }
 
 
}
