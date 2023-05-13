package com.huang;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;
import java.util.Objects;

@ToString
public class Author {
    private Long id;
    private String name;
    private String introduction;
    private Integer age;
    private List<Book> bookList;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Author() {
    }

    public Author(Long id, String name, String introduction, Integer age, List<Book> bookList) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
        this.age = age;
        this.bookList = bookList;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id) && Objects.equals(name, author.name) && Objects.equals(introduction, author.introduction) && Objects.equals(age, author.age) && Objects.equals(bookList, author.bookList);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (bookList != null ? bookList.hashCode() : 0);
        return result;
    }

    /**
     * 使用sorted时比较整个元素时，要实现比较接口，并重写方法
     */

}