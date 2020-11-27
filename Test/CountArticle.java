package Test;

public class CountArticle {
    public static void main(String[] args) {
        String article = "We're of course disappointed that this means it will take slightly longer for this feature to make it into the language, but we think that's the best choice.\n" +
                "\n" +
                "While we can expect\" that for any language feature, there will be a nontrivial volume of \"I would have preferred it differently\" feedback, in reviewing the feedback we have received, I am no longer convinced that we've yet got to the right set of tradeoffs between complexity and expressiveness, or that we've explored enough of the design space to be confident that the current design is the best we can do. By withdrawing, we can continue to refine the design, explore more options, and aim for a preview that actually meets the requirements of the Preview Feature process (JEP 12).";
        System.out.println(article);


        String[] art = article.split(" ");
        for (int i = 0 ; i < art.length ; i++) {
//            art[i] = art[i].strip().('.', null);
            System.out.println(art[i]);
        }

    }
}