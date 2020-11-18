#include<graphics.h>
#include<dos.h>
#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
char ch[80];
void main()
{
	int gdriver = DETECT, gmode;
	void f_color(int,int,int,int);
	int i=300,j=300,m,n=50,score=0;
	int x1=640,y1=200,count1=0;
	int x2=940,y2=300;
	int x3=1240,y3=250;
	int e1=310,e2=300,e3=310,e4=300;
	int l1=280,l2=300,l3=270,l4=290,l5=280,l6=300,l7=270,l8=310,l9=280,l10=300,l11=270,l12=300;
	initgraph(&gdriver, &gmode, "");
	outtextxy(220,50,"-||LEGENDS Presents||-");
	outtextxy(230,100,"-*-*|HELICOPTER GAME|*-*-");
	outtextxy(170,350,"Press any key to Start the game.");
	outtextxy(10,250,"At any time in game Press 'Esc' to Exit the game,and 'P' to pause the game.");
	outtextxy(120,260,"Avoid touching the pillars and the boundries.");
	outtextxy(0,270,"Press 'Spacebar' to jump, use left and right keys to move forward and backwards.");
	circle(i,j,20);
	ellipse(e1,e2,0,360,7,5);
	ellipse(e3,e4,0,360,2,1);
	line(l1,l2,l3,l4);
	line(l5,l6,l7,l8);
	line(l9,l10,l11,l12);

	getch();

	while(1)
	{
		cleardevice();
		setcolor(WHITE);
		m=rand()%15;
		m=7;
		setfillstyle(8,m);
		circle(i,j,20);

		ellipse(e1,e2,0,360,7,5);
		ellipse(e3,e4,0,360,2,1);
		line(l1,l2,l3,l4);
		line(l5,l6,l7,l8);
		line(l9,l10,l11,l12);
		floodfill(i,j,BLACK);
		rectangle(x1,-1,x1+50,y1);
		floodfill(x1+40,y1-10,BLACK);
		rectangle(x1,y1+150,x1+50,480);
		floodfill(x1+40,y1+160,BLACK);
		if(score==0)
		{
			outtext("Press any key to start.");
			getch();
		}
		x1=x1-10;
		count1++;
		score++;
		if(score>500)
		{
			score=score+5;
		}
		if(score>500&&score<700)
		{
			outtextxy(300,200,"SCORE RATE 2X");
		};
		if(score>6000)
		{
			score=score+10;
		}
		if(score>6000&&score<6500)
		{
			outtextxy(200,300,"SCORE RATE 10X");
		}
		if(score>8000)
		{
			score=score+50;
		}
		if(score>8000&&score<9000)
		{
			outtextxy(200,300,"SCORE RATE 50X");
		}

		if(count1==90)
		{
			count1=0;x1=640;y1=rand()%250;
		}
		//sound(rand()%1000);
		//

		rectangle(x2,-1,x2+50,y2);
		floodfill(x2+40,y2-10,BLACK);
		rectangle(x2,y2+150,x2+50,480);
		floodfill(x2+40,y2+160,BLACK);
		x2=x2-10;
		if(count1==30)
		{
			x2=640;y2=rand()%250;
		}
		if(score==500)
		{
			n=n-20;
		}
		if(score==1000)
		{
			n=n-20;
		}
		if(score>=2000)
		{
			j=j+5;
			e2=e2+5;
			e4=e4+5;
			l2=l2+5;
			l4=l4+5;
			l6=l6+5;
			l8=l8+5;
			l10=l10+5;
			l12=l12+5;
		}
		if(score>=4000)
		{
			j=j+5;

			e2=e2+5;
			e4=e4+5;
			l2=l2+5;
			l4=l4+5;
			l6=l6+5;
			l8=l8+5;
			l10=l10+5;
			l12=l12+5;
		}
		if(score>=6000)
		{
			j=j+5;

			e2=e2+5;
			e4=e4+5;
			l2=l2+5;
			l4=l4+5;
			l6=l6+5;
			l8=l8+5;
			l10=l10+5;
			l12=l12+5;
		}
		if(score>=8000)
		{
			j=j+5;

			e2=e2+5;
			e4=e4+5;
			l2=l2+5;
			l4=l4+5;
			l6=l6+5;
			l8=l8+5;
			l10=l10+5;
			l12=l12+5;
		}
		if(score>=10000)
		{
			j=j+5;

			e2=e2+5;
			e4=e4+5;
			l2=l2+5;
			l4=l4+5;
			l6=l6+5;
			l8=l8+5;
			l10=l10+5;
			l12=l12+5;
		}
		if(score>20000)
		{
			j=j+10;

			e2=e2+10;
			e4=e4+10;
			l2=l2+10;
			l4=l4+10;
			l6=l6+10;
			l8=l8+10;
			l10=l10+10;
			l12=l12+10;
		}
		//ch=score;
		sprintf(ch,"Score=%d",score);
		outtext(ch);
		rectangle(x3,-1,x3+50,y3);
		floodfill(x3+40,y3-10,BLACK);
		rectangle(x3,y3+150,x3+50,480);
		floodfill(x3+40,y3+160,BLACK);
		x3=x3-10;
		if(count1==60){x3=640;y3=rand()%250;}
		//delay(10);
		if(kbhit())
		{

			switch(getch())
			{
				case ' ':
					j=j-30;

					e2=e2-30;
					e4=e4-30;
					l2=l2-30;
					l4=l4-30;
					l6=l6-30;
					l8=l8-30;
					l10=l10-30;
					l12=l12-30;
					if(score>6500)
					{
						j=j-20;

						e2=e2-20;
						e4=e4-20;
						l2=l2-20;
						l4=l4-20;
						l6=l6-20;
						l8=l8-20;
						l10=l10-20;
						l12=l12-20;
					}
					circle(i,j,20);

					ellipse(310,300-30,0,360,7,5);
					ellipse(310,300-30,0,360,2,1);
					line(280,300-30,270,290-30);
					line(280,300-30,270,310-30);
					line(280,300-30,270,300-30);
					floodfill(i,j,BLACK);
					sound(100);
					delay(50);
					nosound();
					break;
				case 72:
					j=j-30;
					e2=e2-30;
					e4=e4-30;
					l2=l2-30;
					l4=l4-30;
					l6=l6-30;
					l8=l8-30;
					l10=l10-30;
					l12=l12-30;

					circle(i,j,20);
					ellipse(310,300-30,0,360,7,5);
					ellipse(310,300-30,0,360,2,1);
					line(280,300-30,270,290-30);
					line(280,300-30,270,310-30);
					line(280,300-30,270,300-30);
					floodfill(i,j,BLACK);
					sound(100);
					delay(50);
					nosound();
					break;
				case 'p':
					getch();
					break;
				case 'P':
					getch();
					break;
				case 27:
					end();
					break;
   }
}
	j=j+5;
	e2=e2+5;
	e4=e4+5;
	l2=l2+5;
	l4=l4+5;
	l6=l6+5;
	l8=l8+5;
	l10=l10+5;
	l12=l12+5;

	delay(n);
	if(i>=x1&&i<x1+50)
	{
		if(j<=y1||j>=y1+150)
		{
			end();
		}
	}
	 //
	if(i>=x2&&i<x2+50)
	{
		if(j<=y2||j>=y2+150)
		{
			end();
		}
	}
//
	if(i>=x3&&i<x3+50)
	{
		if(j<=y3||j>=y3+150)
		 {
			end();
		 }
	}


}
}
end()
{
outtextxy(300,200,"GAME OVER!!!!!!!!!");
delay(1000);
outtextxy(300,300,ch);
delay(2000);
//   nosound();
getch();
exit(0);
}
void f_color(int x,int y,int oc,int nc)
{
	if(getpixel(x,y)==nc)
	{
		  f_color(x+1,y,oc,nc);
		  f_color(x-1,y,oc,nc);
		  f_color(x,y+1,oc,nc);
		  f_color(x,y-1,oc,nc);
	}
}