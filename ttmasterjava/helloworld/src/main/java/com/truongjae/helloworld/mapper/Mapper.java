package com.truongjae.helloworld.mapper;

public interface Mapper <S,D>{
    S to(D obj);
    D from(S obj);
}
