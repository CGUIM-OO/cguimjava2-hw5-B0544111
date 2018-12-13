

public class Card {
	enum Suit {Club, Diamond, Heart, Spade};	//���
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
		String rankname="";	//�P���W��
		//�Ʀr�W���ഫ
		if(rank==1){   //�P��=1�A��W��Ace	
			rankname="Ace";
	 	}
		else if(rank==11){	//�P��=11�A��W��Jack
			rankname="Jack";
		}
		else if(rank==12){	//�P��=12�A��W��Queen
			rankname="Queen";
		}
		else if(rank==13){	//�P��=13�A��W��King
			rankname="King";
		}
		else	//��L�P��(2~10)=�쥻�Ʀr
			rankname=String.valueOf(rank);
		System.out.println("Card("+getSuit()+","+rankname+")");	//�L�X�Ҧ��d��
	}
	public Suit getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}
