package TicTacToeMindGame;

public enum Cell {
        X('X'),
        O('O'),
        E(' ');
        private final char value;

        Cell (char value){
            this.value = value;
        }
        public char getValue() {
            return value;
        }
}




