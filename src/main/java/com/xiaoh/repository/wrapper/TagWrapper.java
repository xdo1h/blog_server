package com.xiaoh.repository.wrapper;

import java.util.List;

import com.xiaoh.vo.TagVO;

/**
 * @author shimh
 * <p>
 * 2018年1月25日
 */
public interface TagWrapper {

    List<TagVO> findAllDetail();

    TagVO getTagDetail(Integer tagId);
}
