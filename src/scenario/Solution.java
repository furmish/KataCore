package scenario;

public class Solution {
    public static void main(String[] args) {
        System.out.println(printTextPerRole(new String[]{"Городничий", "Аммос Федорович","Артемий Филиппович","Лука Лукич"}, new String[]{"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.", "Аммос Федорович: Как ревизор?", "Артемий Филиппович: Как ревизор?", "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.", "Аммос Федорович: Вот те на!", "Артемий Филиппович: Вот не было заботы, так подай!", "Лука Лукич: Господи боже! еще и с секретным предписаньем!"}));
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder sb = new StringBuilder();
    for (String role : roles) {
        sb.append(String.format("%s:\n", role));
        for (int i = 0; i < textLines.length; i++) {
            if (textLines[i].startsWith(role + ":")) {
                sb.append(i + 1)
                        .append(") ")
                        .append(textLines[i].replaceFirst(role + ": ", ""))
                        .append("\n");
            }
        }
        sb.append("\n");
    }
    return sb.toString();
    }
}
