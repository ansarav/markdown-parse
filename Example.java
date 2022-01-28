public class Example {


if(markdown.substring(nextOpenBracket +1, nextCloseBracket)== "NotYet"){

    while(currentIndex < markdown.length()) {
        int nextOpenBracket = markdown.indexOf("[", currentIndex);      
        int nextCloseBracket = markdown.indexOf("]", nextOpenBracket);
        int openParen = markdown.indexOf("(", nextCloseBracket);
        int closeParen = markdown.indexOf(")", openParen);       

        if(nextOpenBracket == -1 || nextCloseBracket == -1 || openParen == -1 || closeParen == -1){
            return toReturn;
        } // has to go after variabes DECLARED or else it will be confused             

        toReturn.add(markdown.substring(openParen + 1, closeParen));
        currentIndex = closeParen + 1;           
    }
    return toReturn;
}


}

