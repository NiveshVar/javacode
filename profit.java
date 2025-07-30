#include <stdio.h>

int main() {
    int x, a, b;
    float profit;

    scanf("%d", &x);
    scanf("%d", &a);
    scanf("%d", &b);

    profit = (x * (a - b)) - 100;

    printf("Number of copies sold:%d\n", x);
    printf("Cost of each copy:%d\n", a);
    printf("Cost spent by agency on each newspaper:%d\n", b);
    printf("The profit obtained is Rs.%.2f\n", profit);

    return 0;
}
