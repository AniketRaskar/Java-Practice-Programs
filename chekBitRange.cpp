#include <iostream>
using namespace std;

int main()
{
    int mask = 0;
    unsigned int mask1 = 0xffffffff;
    unsigned int mask2 = 0xffffffff;

    int no = 0, start = 0, end =0;
    cout << "Enter number : " << endl;
    cin >> no;

    cout << "Enter start bit : " << endl;
    cin>>start;

    cout << "Enter end bit: " << endl;
    cin>>end;

    mask1 = mask1 << (start-1);
    mask2 = mask2 >> (32 - end);

    mask = mask1 & mask2;

    cout<<"value of mask : "<<mask<<endl;

    int result = no & mask;

    if(result==mask)
        cout<<"bits are ON "<<endl;
    else
        cout<<"bits are OFF "<<endl;


}