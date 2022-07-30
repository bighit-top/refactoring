package me.whiteship.refactoring._13_loop._33_replace_loop_with_pipeline;

import java.util.List;
import java.util.stream.Collectors;

public class Author {

    private String company;

    private String twitterHandle;

    public Author(String company, String twitterHandle) {
        this.company = company;
        this.twitterHandle = twitterHandle;
    }

    static public List<String> TwitterHandles(List<Author> authors, String company) {
//        var result = new ArrayList<String> ();
//        for (Author a : authors) {
//            if (a.company.equals(company)) {
//                var handle = a.twitterHandle;
//                if (handle != null)
//                    result.add(handle);
//            }
//        }
//        return result;

        return authors.stream() //for (Author a : authors) {
                .filter(author -> author.company.equals(company)) //if (a.company.equals(company)) {
                .map(author -> author.twitterHandle) //var handle = a.twitterHandle;
                .filter(t -> t != null) //if (handle != null)
                .collect(Collectors.toList());//result.add(handle); }}

    }

}
