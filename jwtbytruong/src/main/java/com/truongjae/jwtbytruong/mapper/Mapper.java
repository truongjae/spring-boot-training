package com.truongjae.jwtbytruong.mapper;

public interface Mapper <S,D>{
    S to(D obj);
    D from(S obj);
}
