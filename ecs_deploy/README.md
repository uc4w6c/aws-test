## スタック更新
$ aws cloudformation deploy --template ecr.yaml --stack-name create-ecr
$ aws cloudformation deploy --template ecs-cluster.yaml --stack-name create-ecs-cluster

$ aws cloudformation deploy --template ecs-service.yaml --stack-name create-ecs-service --capabilities CAPABILITY_IAM --parameter-overrides DockerImage=XXXXXXXXXX.dkr.ecr.ap-northeast-1.amazonaws.com/deploy-test-repository:init

$ aws cloudformation deploy --template code-pipeline.yaml --stack-name create-code-pipeline --parameter-overrides SecurityGroup=sg-XXXXXX Subnet=subnet-XXXXXXXX GitHubRepositoryName=XXXX GitHubAccountName=XXXXX GitHubOAuthToken=XXXXXXXXXXXXXXXXXXXXXXX --capabilities CAPABILITY_IAM
