import com.codeborne.selenide.ElementsCollection;

import javax.lang.model.element.Element;

import static com.codeborne.selenide.Selenide.$$x;

public class SearchPages {
    private final ElementsCollection articleTitles = $$x("//h2//a");

    /**
     * возвращает href из первой статьи
     * @return
     */
    public String getHrefFrontFirstArticle(){
    return articleTitles.first().getAttribute("href");

    }
}
