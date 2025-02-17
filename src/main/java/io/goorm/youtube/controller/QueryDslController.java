package io.goorm.youtube.controller;

import io.goorm.youtube.domain.Video;
import io.goorm.youtube.repository.case1.VideoQueryRepository;
import io.goorm.youtube.service.impl.MemberServiceImpl;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class QueryDslController {

    private final VideoQueryRepository videoQueryRepository;

    @Autowired
    public QueryDslController(VideoQueryRepository videoQueryRepository) {
        this.videoQueryRepository = videoQueryRepository;
    }

    @GetMapping("/case1/test1")
    public ResponseEntity<?> test6(@RequestParam Long memberSeq) {

        List<Video> videos = videoQueryRepository.findPublicVideosByMember(memberSeq);

        return ResponseEntity.ok().body(videos);
    }


}
