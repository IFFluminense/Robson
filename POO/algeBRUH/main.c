#include <stdio.h>
#include <stdlib.h>

const int tam = 5;

int example1()
{
    int x[tam];
    int c;
    for (c = 0; c < tam; c++){
        printf("Digite o valor: ");
        scanf("%d", &x[c]);
    }
    for (c = 0; c < tam; c++){
        printf("\n O valor de da posicao %d eh igual a %d", c, x[c]);
    }
}
void leitura(int *x, int T){
    int c;
    for (c = 0; c < T; c++){
        printf("\n Valor de X[%d]: ", c);
        scanf("%d", &x[c]);
    }
}
void montaC(int *x, int *y, int *z){
    int c;
    for (c = 0; c < tam; c++){
        z[c] = x[c] + y[c];
    }
}

float avgCalc(int *x){
    int c, med, sum;
    for (c = 0; c < tam; c++){
        sum += x[c];
    }
    med = sum/tam;
    return med;
}

void bubbleSort (int vetor[], int T) {
    int k, j, aux;

    for (k = 1; k < T; k++) {
        printf("\n[%d] ", k);

        for (j = 0; j < T - 1; j++) {
            printf("%d, ", j);

            if (vetor[j] > vetor[j + 1]) {
                aux          = vetor[j];
                vetor[j]     = vetor[j + 1];
                vetor[j + 1] = aux;
            }
        }
    }
}

int activity1(){
    int a[tam];
    int b[tam];
    int result[tam];
    int c;
    float medA, medB, medC;

    leitura(a, tam);
    leitura(b, tam);
    montaC(a,b,result);
    for (c = 0; c < tam; c++){
        printf("\n A[%d] = %d \t B[%d] = %d \t C[%d] = %d", c, a[c], c, b[c], c, result[c]);
    }
    medA = avgCalc(a);
    printf("\n A media de A igual a %f", medA);
    medB = avgCalc(b);
    printf("\n A media de B igual a %f", medB);
    /*medC = avgCalc(c);
    printf("\n A media de C igual a %f", medC);*/

    bubbleSort(a, tam);

    /*for (c = 0; c < tam; c++){
        printf("\n N1%d", a[c]);
    }*/
}

int main(){
    activity1();
}
























