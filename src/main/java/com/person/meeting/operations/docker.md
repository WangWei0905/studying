Docker是什么？
Docker是一个容器化平台，它将应用程序及其所有依赖项打包在容器中，确保应用程序在不同环境中无缝运行。

Docker与虚拟机的区别？
虚拟化技术在物理服务器上运行多个操作系统，而容器化技术在同一操作系统上部署多个应用程序。Docker容器共享宿主机的内核，而虚拟机拥有独立的内核。

描述Docker容器的生命周期。
Docker容器的生命周期包括创建、运行、暂停（可选）、恢复（可选）、启动、停止、重启、杀死和销毁。

Docker容器有哪些状态？
Docker容器的状态包括：starting（运行状态）、exited（退出状态）、paused（暂停状态）、healthy（健康状态）和unhealthy（非健康状态）。

为什么Docker的CentOS镜像只有200MB，而传统安装的CentOS镜像是4.4GB？
Docker镜像仅包含运行所需的最小环境，共用宿主机的内核，因此只需要rootfs。不同的Linux发行版可以共用bootfs，所以镜像体积小。

容器退出后，通过docker ps命令看不到，数据会丢失吗？
容器退出后会处于终止状态，可以使用docker ps -a查看。数据不会丢失，可以通过docker start命令重新启动容器。只有删除容器才会清除所有数据。

什么是Docker Hub？
Docker Hub是一个基于云的注册服务，允许用户链接代码存储库、构建和测试镜像、存储手动推送的镜像，并提供指向Docker云的链接，以便将镜像部署到主机。

如何在一个容器中同时运行多个应用进程？
通常不推荐在同一个容器内运行多个应用进程，但可以通过进程管理机制，如supervisord来管理所运行的进程。

如何从Docker镜像中创建一个Docker容器？
使用docker run命令从Docker资源库中拉出想要的镜像并创建容器。

如何把主机的东西拷贝到容器内部？
使用docker cp命令将主机的内容拷贝到容器内部，也可以将容器内部的内容拷贝到主机


Docker 提供了一系列命令来管理容器的生命周期，包括创建、运行、停止、删除等。以下是一些常见的 Docker 命令：

1. **docker run**：创建并启动一个新的容器。
   ```sh
   docker run [OPTIONS] IMAGE [COMMAND] [ARG...]
   ```

2. **docker start**：启动一个或多个已经停止运行的容器。
   ```sh
   docker start [OPTIONS] CONTAINER...
   ```

3. **docker stop**：停止一个或多个正在运行的容器。
   ```sh
   docker stop [OPTIONS] CONTAINER...
   ```

4. **docker rm**：删除一个或多个容器。
   ```sh
   docker rm [OPTIONS] CONTAINER...
   ```

5. **docker rmi**：删除一个或多个镜像。
   ```sh
   docker rmi [OPTIONS] IMAGE...
   ```

6. **docker ps**：列出当前正在运行的容器。
   ```sh
   docker ps [OPTIONS]
   ```

7. **docker images**：列出本地的镜像。
   ```sh
   docker images [OPTIONS] [REPOSITORY...]
   ```

8. **docker pull**：从镜像仓库拉取或更新指定的镜像。
   ```sh
   docker pull [OPTIONS] NAME[:TAG|@DIGEST]
   ```

9. **docker push**：将本地的镜像推送到镜像仓库。
   ```sh
   docker push [OPTIONS] NAME[:TAG]
   ```

10. **docker exec**：在运行的容器内执行命令。
    ```sh
    docker exec [OPTIONS] CONTAINER COMMAND [ARG...]
    ```

11. **docker logs**：获取容器的日志。
    ```sh
    docker logs [OPTIONS] CONTAINER
    ```

12. **docker build**：根据 Dockerfile 构建镜像。
    ```sh
    docker build [OPTIONS] PATH | URL | -
    ```

13. **docker tag**：给本地镜像打标签。
    ```sh
    docker tag [OPTIONS] IMAGE[:TAG] [REGISTRYHOST/][USERNAME/]NAME[:TAG]
    ```

14. **docker inspect**：获取容器或镜像的详细信息。
    ```sh
    docker inspect [OPTIONS] NAME|ID [NAME|ID...]
    ```

15. **docker network**：管理 Docker 网络设置。
    ```sh
    docker network [OPTIONS] COMMAND
    ```

16. **docker volume**：管理 Docker 数据卷。
    ```sh
    docker volume [OPTIONS] COMMAND
    ```

17. **docker cp**：在容器和主机之间复制文件或文件夹。
    ```sh
    docker cp [OPTIONS] CONTAINER:SRC_PATH DEST_PATH|-
    docker cp [OPTIONS] SRC_PATH|- CONTAINER:DEST_PATH
    ```

18. **docker restart**：重启一个或多个容器。
    ```sh
    docker restart [OPTIONS] CONTAINER...
    ```

19. **docker attach**：附加到一个正在运行的容器。
    ```sh
    docker attach [OPTIONS] CONTAINER
    ```

20. **docker-compose**：用来定义和运行多容器 Docker 应用程序的工具。

这些命令是 Docker 用户日常工作的基础，掌握它们可以帮助你更有效地使用 Docker。



