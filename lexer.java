public class code { 
  static lexer(String source) {
    int pos = 0;
    int line = 1;
    int column = 1;
    List<String[]> tokens = new ArrayList<>();
    final Map<char, String> Simples = Map.of(
      '(', "LPAREN",
      ')', "RPAREN",
      '[', "LBRACK",
      ']', "RBRACK",
      '<', "LAB",
      '>': "RAB"
      '|', "PIPE",
      ':', "COLON",
      ',', "COMMA",
      '&', "AND",
      '.', "PERIOD"
    );
    final Map<String, String> Keywords = Map.of(
      "import", "IMPORT",
      "pack", "PACKAGE",
      "allows", "ALLOW",
      "anyy", "ANY_ARG",
      "output", "OUTPUT_PACK",
      "input", "INPUT_PACK",
      "new", "NEW_PACK",
      "uses", "FUNC_DEF",
      "has", "FUNC_CALL_ARG",
      "equals", "EQ",
      "greater_than", "GREATER"
    );
    boolean digit(char x) {return x >= '0' && x <= '9'};
    boolean letter(char x) {return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')};
    boolean alpha(char x) {return digit(x) || letter(x)};
    void move() {pos += 1; column += 1};
    void move(int n) {pos += n; column += n};
    void token(String type, String value) {tokens.add(new String[]{type, value})};
    while(pos < source.length()) {
      char current = source.charAt(pos);
      switch(current) {
        case '"': case '\'':
          String value = "";
          move();
          while(source.charAt(pos) !== current) {value += source.charAt(pos); move()};
          token("STRING", value);
          move();
          break;
        case ' ': case '\r': case '\t':
          move();
          break;
        case '\n':
          line += 1; column = 1;
          move();
          break;
        case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' ->
          String value2 = "";
          while(digit(source.charAt(pos))) {value2 += source.charAt(pos); move()};
          token("NUMBER", value2);
          break;
        default:
          if(letter(current)) {
            String value3 = "";
            while(digit(source.charAt(pos))) {value3 += source.charAt(pos); move()};
            if(
      };
};
