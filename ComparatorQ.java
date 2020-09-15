package zaid;

public class ComparatorQ {

		String player;
		int score;
		
		ComparatorQ(String player,int score){
			this.player=player;
			this.score=score;
			

	}


		public String getPlayer() {
			return player;
		}

		public void setPlayer(String player) {
			this.player = player;
		}

		public int getScore() {
			return score;
		}

		public void setScore(int score) {
			this.score = score;
		}
		
		public String toString() {
			return "\nPlayer Name:"+ this.player+"\nScore:"+this.score;
		}

}
