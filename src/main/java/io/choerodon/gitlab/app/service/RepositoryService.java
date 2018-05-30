package io.choerodon.gitlab.app.service;

import java.util.List;

import org.gitlab4j.api.models.Branch;
import org.gitlab4j.api.models.Tag;


public interface RepositoryService {

    /**
     * 创建新分支
     *
     * @param projectId  项目id
     * @param branchName 分支名
     * @param source     源分支名
     * @param userId     用户Id
     * @return Branch
     */
    Branch createBranch(Integer projectId, String branchName, String source, Integer userId);

    /**
     * 获取tag列表
     *
     * @param projectId 项目id
     * @param userId    用户Id
     * @return List
     */
    List<Tag> listTags(Integer projectId, Integer userId);

    /**
     * 分页获取tag列表
     *
     * @param projectId 项目id
     * @param page      页码
     * @param perPage   每页数量
     * @param userId    用户Id
     * @return List
     */
    List<Tag> listTagsByPage(Integer projectId, int page, int perPage, Integer userId);

    /**
     * 创建tag
     *
     * @param projectId 项目id
     * @param tagName   标签名
     * @param ref       标签源
     * @param userId    用户Id
     * @return Tag
     */
    Tag createTag(Integer projectId, String tagName, String ref, Integer userId);

    /**
     * 根据分支名删除分支
     *
     * @param projectId  项目id
     * @param branchName 分支名
     * @param userId     用户Id
     */
    void deleteBranch(Integer projectId, String branchName, Integer userId);

    /**
     * 根据分支名查询分支
     *
     * @param projectId  项目id
     * @param branchName 分支名
     * @return Branch
     */
    Branch queryBranchByName(Integer projectId, String branchName);


    /**
     * 获取项目下所有分支
     *
     * @param projectId 项目id
     * @param userId    用户Id
     * @return List
     */
    List<Branch> listBranches(Integer projectId, Integer userId);


    /**
     * 项目下创建readme
     *
     * @param projectId 项目id
     * @param userId    用户Id
     * @return boolean
     */
    boolean createFile(Integer projectId, Integer userId);

    String getFileReadme(Integer projectId, String commit);
}