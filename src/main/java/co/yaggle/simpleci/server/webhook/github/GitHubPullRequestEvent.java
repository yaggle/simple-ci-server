package co.yaggle.simpleci.server.webhook.github;

import co.yaggle.simpleci.server.git.GitPullRequestEvent;
import lombok.Data;

@Data
public class GitHubPullRequestEvent {
    /**
     * Get the equivalent {@link GitPullRequestEvent}.
     *
     * @param uuid this repository's unique ID
     * @return the equivalent {@link GitPullRequestEvent}
     */
    public GitPullRequestEvent toGitPullRequestEvent(String uuid) {
        // TODO
        return null;
    }
}