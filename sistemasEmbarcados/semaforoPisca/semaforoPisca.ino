// C++ code
// 
const int ledVerde = 7;
const int ledAmarelo = 8;
const int ledVermelho = 9;
bool isEven(int n){ return (n % 2 == 0); } 

void setup()
{

  pinMode(ledVermelho, OUTPUT);
  pinMode(ledAmarelo, OUTPUT);
  pinMode(ledVerde, OUTPUT);
}

void loop()
{
  digitalWrite(ledVermelho, 0);  digitalWrite(ledAmarelo, 0);  digitalWrite(ledVerde, 1);    
  delay(6000);
  for (int c = 1;  c <= 30; c++){
    if (isEven(c)){
    digitalWrite(ledAmarelo, 1); digitalWrite(ledVermelho, 0); digitalWrite(ledVerde, 0); delay(100);}
    else {
    digitalWrite(ledAmarelo, 0); delay(100);}}
  digitalWrite(ledVermelho, 1);  digitalWrite(ledAmarelo, 0);  digitalWrite(ledVerde, 0 ); 
  delay(6000);    
}
