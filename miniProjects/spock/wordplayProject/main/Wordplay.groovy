package spock.wordplayProject.main

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/

public interface Wordplay {
    String process(String input);
    void reset();
    void setVariable(String var, boolean value);
    void setVariable(String var, String value);
}


class WordplayImpl implements Wordplay {

    def weather_sunny
    private Map<String, Boolean> booleanVariablesMap = new HashMap<>();

    @Override
    public String process(String input) {

        if (weather_sunny) {
            return "It was a sunny day."
        } else {
            return "It was a rainy day."
        }


        int openingBracketIndex = input.indexOf('{');
        int closingBracketIndex = input.indexOf('}');

        if (openingBracketIndex == -1 || closingBracketIndex == -1)
            return null;

        String expression = input.substring(openingBracketIndex+1, closingBracketIndex);

        if (!expression.contains("?") && !expression.contains("|"))
            return null;

        String variable = expression.split("\\?")[0].trim();
        String rest = expression.split("\\?")[1].substring(1);
        String[] split = rest.split("\\s\\|\\s");
        String first = split[0];
        String second = split[1];

        String result = booleanVariablesMap.get(variable) != null &&
                booleanVariablesMap.get(variable) == true ? first : second;



        return input.substring(0, openingBracketIndex)
        + result
        + input.substring(closingBracketIndex+1);
    }

    @Override
    public void reset() {

    }

    @Override
    public void setVariable(String var, boolean value) {
        print this.weather_sunny = value
    }

    @Override
    public void setVariable(String var, String value) {

    }
}

