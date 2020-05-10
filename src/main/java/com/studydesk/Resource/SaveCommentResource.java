package com.studydesk.Resource;

import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

public class SaveCommentResource {
    @NotNull
    @Lob
    private String text;

}
