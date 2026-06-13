public class code { 
  static int pos = 0;
  static int line = 1;
  static int column = 1;
  static List<String[]> tokens = new ArrayList<>();
  //helper functions
  static boolean digit(char x) {return x >= '0' && x <= '9'};
  static boolean letter(char x) {return (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')};
  static boolean alpha(char x) {return digit(x) || letter(x)};
  static void move() {pos += 1; column += 1};
  static void move(int n) {pos += n; column += n};
  static void token(String type, String value) {tokens.add(new String[]{type, value})};
  //lexer
  static lexer(String source) {
    final Map<Character, String> simples = Map.ofEntries(
      Map.entry('(', "LPAREN"),
      Map.entry(')', "RPAREN"),
      Map.entry('[', "LBRACK"),
      Map.entry(']', "RBRACK"),
      Map.entry('<', "LAB"),
      Map.entry('>', "RAB"),
      Map.entry('|', "PIPE"),
      Map.entry(':', "COLON"),
      Map.entry(',', "COMMA"),
      Map.entry('&', "AND"),
      Map.entry('.', "PERIOD")
    );
    final Map<String, String> keywords = Map.ofEntries(
      //program
      Map.entry("start_it", "PROGRAM_START"),
      Map.entry("pause_it_for", "PROGRAM_PAUSE"),
      Map.entry("end_it", "PROGRAM_END"),
      //packages
      Map.entry("import_pack", "IMPORT_PACKAGE"),
      Map.entry("allows", "ALLOW"),
      Map.entry("anyy", "ANY_ARG"),
      Map.entry("new", "NEW_PACK"),
      Map.entry("output", "OUTPUT_PACK"),
      Map.entry("input", "INPUT_PACK"),
      //functions
      Map.entry("function", "FUNC_DEF"),
      Map.entry("uses", "FUNC_DEF_BODY"),
      Map.entry("has", "FUNC_CALL_ARG"),
      //variables
      Map.entry("string", "TEXT_STRING_TYPE"),
      Map.entry("integer", "INTEGER_TYPE"),
      Map.entry("binteger", "BIG_INTEGER_TYPE"),
      Map.entry("float", "FLOAT_TYPE"),
      Map.entry("boolean", "BOOLEAN_TYPE"),
      Map.entry("any", "ANY_TYPE"),
      Map.entry("empty", "VALUELESS_DECLARE"),
      Map.entry("stuck", "UNCHANGEABLE_DECLARE");
      Map.entry("equals", "EQ"),
      //conditions
      Map.entry("is", "COND_EQ"),
      Map.entry("greater_than", "GREATER"),
      Map.entry("smaller_than", "SMALLER"),
      Map.entry("smaller_equals", "SMALLER_EQ"),
      Map.entry("greater_equals", "GREATER_EQ"),
      Map.entry("then", "COND_BODY_START"),
      Map.entry("do", "LOOP_START"),
      Map.entry("finish", "BLOCK_FINISH")
    );
    while(pos < source.length()) {
      char current = source.charAt(pos);
      switch(current) {
        case '"', '\'' -> {
          String value = "";
          move();
          while(source.charAt(pos) != current) {value += source.charAt(pos); move()};
          token("STRING", value);
          move();
        };
        case ' ', '\r', '\t' -> move();
        case '\n' -> {line += 1; column = 1; move()};
        case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> {
          String value2 = "";
          while(digit(source.charAt(pos))) {value2 += source.charAt(pos); move()};
          token("NUMBER", value2);
        };
        default -> {
          if(letter(current)) {
            String value3 = "";
            while(alpha(source.charAt(pos)) || source.charAt(pos) == '_') {value3 += source.charAt(pos); move()};
            String type = keywords.get(value3);
            if(type != null) {token(type + "_KEYWORD", value3)} else {token("IDENTIFIER", value3)};
          };
        };
      };
    };
    token("EOF", null);
    return List;
  };
};
