package com.mysite.sbb;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.sbb.question.ArticleDAO;
import com.mysite.sbb.question.ArticleDTO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
class SbbMapperTests {

    @Autowired
    private ArticleDAO articleDAO;

    @Test
    @Transactional
    void testFindAll() throws Exception {
        List<ArticleDTO> list = articleDAO.getArticleList();
        for(ArticleDTO dto:list) {
            log.info(dto);
        }
    }
}