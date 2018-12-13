

public class Card {
	enum Suit {Club, Diamond, Heart, Spade};	//花色
	Suit suit;  //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; //1~13	
	/**
	 * @param s suit
	 * @param r rank
	 */
	
	public Card(Suit s,int value){
		suit=s;
		rank=value;
	}
	
	public void printCard(){
		//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
		String rankname="";	//牌號名稱
		//數字名稱轉換
		if(rank==1){   //牌號=1，改名為Ace	
			rankname="Ace";
	 	}
		else if(rank==11){	//牌號=11，改名為Jack
			rankname="Jack";
		}
		else if(rank==12){	//牌號=12，改名為Queen
			rankname="Queen";
		}
		else if(rank==13){	//牌號=13，改名為King
			rankname="King";
		}
		else	//其他牌號(2~10)=原本數字
			rankname=String.valueOf(rank);
		System.out.println("Card("+getSuit()+","+rankname+")");	//印出所有卡片
	}
	public Suit getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}
