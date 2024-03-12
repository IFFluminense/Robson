#include <stdio.h>
#include <stdlib.h>

int main()
{
    int x, y; float n1,n2,med,soma, maior,med6; char nome; int c, banr;
    float notas[11];
    //printf("Valor de X:"); scanf("%d",&x);
    //printf("Valor de Y:"); scanf("%d",&y);
    //soma = x+y; printf("Valor da soma eh igual a %d", soma);
    //printf("Valor de N1:"); scanf("%f",&n1);printf("Valor de N2:"); scanf("%f",&n2);med = (n1+n2)/2;if (med >= 6){printf("Aprovado com nota %.2f", med);}else {if(med >= 4){printf("Em recuperacao com nota %.2f", med);}else{printf("Reprovado com nota %.2f", med);}}for (c=1;c<=10;c++){printf("%d",c);}
    for (c=1; c <=10; c++){
        printf("Insira a nota %d: ",c);
        scanf("%f",&notas[c]);
    }
    soma = 0;
    for (c=1; c <=10; c++){
        soma = soma +notas[c];
        printf("%f \n",notas[c]);
    }
    med = soma/10;
    printf("Media eh igual a %f \n", med);
    maior = 0;
    for (c=1; c<=10; c++){
        if (maior < notas[c]){
            maior = notas[c];
        }
    }
    printf("Maior eh igual a %f",maior);
    banr = 0;
    soma = 0;
    for (c=1; c<=10; c++){
        if (notas[c] > 6){
            banr = banr +1;
            soma = soma + notas[c];

        }}
        med6 = soma/banr;
        printf("Sua media acima de 6 eh igual a %f",med6);
}
