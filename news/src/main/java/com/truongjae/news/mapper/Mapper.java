package com.truongjae.news.mapper;
import java.util.List;
import java.util.Set;

public interface Mapper<S,D>{
    S to(D obj);
}
