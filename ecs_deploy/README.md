## スタック更新
$ aws cloudformation deploy --template ecr.yaml --stack-name create-ecr
$ aws cloudformation deploy --template ecs-cluster.yaml --stack-name create-ecs-cluster

$ aws cloudformation deploy --template ecs-service.yaml --stack-name create-ecs-service --parameter-overrides DockerImage=XXXXXXXXXX.dkr.ecr.ap-northeast-1.amazonaws.com/deploy-test-repository:init
