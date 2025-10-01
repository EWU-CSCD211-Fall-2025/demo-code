
# Authenticating git

## Notes:

Do not share your PAT or store it in an insecure way. If you store it in plaintext, your security is only as strong as your filesystem security. Do not share it with anyone. Treat it like you would a password.

## Create a Personal Access Token (PAT) (classic)
- Go to your GitHub account settings.
- Navigate to Developer settings > Personal access tokens.
- Click on "Generate new token" (classic). You are free to use the fine-grained tokens as well, but this guide will focus on the classic tokens.
- Select all in `repo`
- Click "Generate token" and copy it. Paste it into a notepad or another text editor temporarily for use in a later step.

## Configuration git to automatically use your PAT

Now, the question is: how do we store our PAT so we don't have to enter it every time we push code or clone a repository?

### Option 1: Plaintext (maybe okay for our purposes, but not great)

- Open your terminal or command prompt.
- Configure Git to use a credential helper that can store your PAT securely. A common and recommended method is using the store helper, which writes credentials to a plain-text file (e.g., ~/.git-credentials).
- Execute the following command: 
```
git config --global credential.helper store
```

### Option 2: in-memory (also not great)

- Open your terminal or command prompt.
- Store your credentials in memory with a specified timeout in seconds
- Execute the following command: `git config credential.helper 'cache --timeout=3600'`

### Option 3: gpg (better) -- GCM with GPG (Linux Example)

Here we are going to use an encrypted credential manager (like a password manager)

1. Install pass and gnupg
```
sudo apt update
sudo apt install pass
sudo apt install gnupg
```
2.  Generate GPG Key
```
gpg --full-generate-key
```
3. Use default options. You don't need to use your real name and email address. You can just hit enter for email. Once you have your user ID and key, enter the following
```
pass init YOUR_USER_ID
```

4. Now, use gpg to authenticate:
```
git config --global credential.credentialStore gpg
```

## Provide the PAT when prompted:

- The next time Git needs to authenticate (e.g., when you git clone, git push, or git pull from a remote repository), it will prompt you for your username and password.
- When prompted for the password, copy/paste your PAT instead of your regular account password.
- Git will then store this PAT in the configured credential helper for future use, so you won't be prompted again for the same repository unless the token expires or is revoked.


## To clone a repo to your computer follow the below steps:

### Clone the repository to your computer:
<img width="956" height="513" alt="image" src="https://github.com/user-attachments/assets/edbc3e35-1057-45a4-9deb-2022d7ab1917" />


* Navigate to your git repository (the repository for the assignment), 
* Click on the green Code dropdown, then copy the HTTP repo link to copy to clipboard
* Enter the following into your terminal, replacing the link with the one you just copied. (Hint: use ctrl+shift+v to paste into the terminal)
```
git clone https://github.com/username/repo.git
```
When prompted, enter the following:
* Username: your-username
* Password: your-personal-access-token