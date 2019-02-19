#!/usr/bin/env groovy
def config = [
    scriptVersion          : 'v6',
    pipelineScript         : 'https://git.aurora.skead.no/scm/ao/aurora-pipeline-scripts.git',
    affiliation            : "paas",
    downstreamSystemtestJob: [branch: env.BRANCH_NAME],
    credentialsId          : "github",
    versionStrategy        : [
        [branch: 'master', versionHint: '3'],
        [branch: 'release/v2', versionHint: '2']
    ]
]
fileLoader.withGit(config.pipelineScript, config.scriptVersion) {
  jenkinsfile = fileLoader.load('templates/leveransepakke')
}
jenkinsfile.run(config.scriptVersion, config)
